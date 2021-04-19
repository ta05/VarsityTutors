import random

charities = []
donations = []

for i in range(100):
    charities.append(random.randint(1, 15))
    donations.append((int)((random.random() * 100 + 1) * 100) / 100.00)
    
num_donations = [0] * 15
total_donations = [0] * 15

for i in range(len(charities)):
    index = charities[i] - 1
    num_donations[index] += 1
    total_donations[index] += donations[index]

average = [] 
for i in range(15):
    average.append(total_donations[i]/num_donations[i] if num_donations[i] > 0 else 0)
    print("Charity {} received {} donation(s) of ${:.2f} for an average of ${:.2f} per donation".format(i + 1, num_donations[i], total_donations[i], average[i]))