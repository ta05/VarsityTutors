from functools import reduce

def reorg(sprnt):
    new_sprnt = {}
    for name in sprnt:
        for task in sprnt[name]:
            new_sprnt[task] = {}
    
    for name in sprnt:
        for task in sprnt[name].keys():
            if task in new_sprnt:
                new_sprnt[task][name] = sprnt[name][task]
    
    return new_sprnt

def add_sprint(sprnt1, sprnt2):
    new_sprnt = sprnt1
    for task in sprnt2:
        if task in new_sprnt:
            for name in sprnt2[task]:
                if name in new_sprnt[task]:
                    new_sprnt[task][name] = new_sprnt[task][name] + sprnt2[task][name]
                else:
                    new_sprnt[task][name] = sprnt2[task][name]
        else:
            new_sprnt[task] = sprnt2[task]
    return new_sprnt

def add_n_logs(logList):
    return reduce(add_sprint, list(map(reorg, logList)))


sprnt = {'Jack': {'task1': 5}, 'Rae': {'task1': 8, 'task2': 10}, 'Frank': {'task3': 4}, 'Nancy': {'task2': 2, 'task1': 3, 'task3': 4}, 'Victoria': {'task2': 7, 'task3': 3}}
sprnt2 = {'Leila': {'task1': 8, 'task3': 2}, 'Frank': {'task3': 5, 'task2': 1}, 'Rae': {'task3': 5}, 'Hannah': {'task1': 6, 'task2': 4}}
sprnt3 = {'Tom': {'task4': 12}, 'Ann': {'task1': 7, 'task3': 3}, 'Jack': {'task2': 10, 'task4': 3}}
sprnt4 = {'Leila': {'task4': 5}, 'Victoria': {'task1': 3, 'task3': 6}, 'Ron': {'task2': 8, 'task1': 5}, 'Nancy': {'task3': 4, 'task2': 3, 'task1': 2, 'task4': 1}}

print(reorg(sprnt))

print(add_sprint(reorg(sprnt), reorg(sprnt2)))

logList = [sprnt, sprnt2, sprnt3, sprnt4]

print(add_n_logs(logList))