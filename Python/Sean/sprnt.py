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


sprnt = {'Jack': {'task1': 5}, 'Rae': {'task1': 8, 'task2': 10}, 'Frank': {'task3': 4}, 'Nancy': {'task2': 2, 'task1': 3, 'task3': 4}, 'Victoria': {'task2': 7, 'task3': 3}}
print(reorg(sprnt))