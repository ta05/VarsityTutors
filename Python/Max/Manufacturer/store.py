import csv
from datetime import date

class Item:
    def __init__(self, id, manufacturer, device, damaged=False):
        self.id = id
        self.manufacturer = manufacturer
        self.device = device
        self.damaged = damaged

    def __repr__(self):
        return "ID: {}\nManufacturer: {}\nDevice: {}\nDamaged: {}".format(self.id, self.manufacturer, self.device, self.damaged)


def query(itemlist, servicedates, prices, manufacturer, device):
    item = get_item(itemlist, servicedates, prices, manufacturer, device)
    if item is None:
        print("No such item in inventory")
    else:
        price = prices[item.id]
        print("Your item is: {} {} {} ${}".format(item.id, item.manufacturer, item.device, price))
        item = get_other_item(itemlist, servicedates, prices, manufacturer, device, price)
        if item is not None:
            print("You may also consider: {} {} {} ${}".format(item.id, item.manufacturer, item.device, prices[item.id]))


def most_expensive_item(itemlist, prices):
    most_expensive_item = itemlist[0]
    highest_price = prices[most_expensive_item.id]
    for item in itemlist:
        if highest_price < prices[item.id]:
            most_expensive_item = item
            highest_price = prices[item.id]
    return most_expensive_item

def closest_priced_item(itemlist, prices, price):
    closest_price_item = itemlist[0]
    closest_price = prices[itemlist[0].id]
    smallest_price_diff = abs(price - closest_price)
    for item in itemlist[1:]:
        if abs(prices[item.id] - price) < smallest_price_diff:
            closest_price_item = item
            closest_price = prices[item.id]
            smallest_price_diff = abs(price - closest_price)
    return closest_price_item

def convert_date(date):
    month, day, year = date.split("/")
    month = ("0" + month)[-2:]
    day = ("0" + day)[-2:]
    return year + "-" + month + "-" + day
    
def get_item(itemlist, servicedates, prices, manufacturer, device):
    today = str(date.today())
    filtered_list = [x for x in itemlist if x.manufacturer.lower() == manufacturer and x.device.lower() == device and not x.damaged and convert_date(servicedates[x.id]) > today]
    if len(filtered_list) > 0:
        return most_expensive_item(filtered_list, prices)

def get_other_item(itemlist, servicedates, prices, manufacturer, device, price):
    today = str(date.today())
    filtered_list = [x for x in itemlist if x.manufacturer.lower() != manufacturer and x.device.lower() == device and not x.damaged and convert_date(servicedates[x.id]) > today]
    if len(filtered_list) > 0:
        return closest_priced_item(filtered_list, prices, price)

if __name__ == "__main__":
    manu_file = open("./Max/Manufacturer/lists/ManufacturerList.csv")
    manufacturers = csv.reader(manu_file, delimiter=",")
    itemlist = []
    for row in manufacturers:
        device_damaged = row[2].split("\t")
        if len(device_damaged) == 2 and device_damaged[1].strip() == "damaged":
            itemlist.append(Item(row[0], row[1], device_damaged[0], True))
        else:
            itemlist.append(Item(row[0], row[1], device_damaged[0], False))
    
    price_file = open("./Max/Manufacturer/lists/PriceList.csv")
    prices = csv.reader(price_file, delimiter=",")
    price_dict = {row[0]: int(row[1]) for row in prices}
    

    service_file = open("./Max/Manufacturer/lists/ServiceDatesList.csv")
    servicedates = csv.reader(service_file, delimiter=",")
    dates_dict = {row[0]: row[1] for row in servicedates}

    term = input("Please enter a manufacturer and a item type separated by a space: ").lower()

    while term != "q":
        manufacturer, device = term.split()
        print(manufacturer, device)
        query(itemlist, dates_dict, price_dict, manufacturer, device)
        term = input("Please enter a manufacturer and a item type separated by a space (Enter a 'q' to quit): ").lower()

    
    
    manu_file.close()
    price_file.close()
    service_file.close()