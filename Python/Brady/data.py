def get_students_grades():

    students_grades = [
        'COMM1000, AA0001, 14.9',
        'COMM1000, AA0002, 71.3',
        'COMM1000, AA0003, 26.5',
        'COMM1000, AA0004, 0.7',
        'COMM1000, AA0005, 90.5',
        'COMM1000, AA0006, 58.5',
        'COMM1000, AA0007, 91.5',
        'COMM1000, AA0008, 84.3',
        'COMM1000, AA0009, 23.7',
        'COMM1000, AA0010, 69.1',
        'COMM1000, AA0011, 50.1',
        'COMM1000, AA0012, 92.3',
        'COMM1000, AA0013, 28.2',
        'COMM1000, AA0014, 98.7',
        'COMM1000, AA0015, 73.8',
        'COMM1000, AA0016, 8.4',
        'COMM1000, AA0017, 36.8',
        'COMM1000, AA0018, 54.6',
        'COMM1000, AA0019, 39.1',
        'COMM1000, AA0020, 22.1',
        'COMM1000, AA0021, 82.0',
        'COMM1000, AA0022, 2.1',
        'COMM1000, AA0023, 13.5',
        'COMM1000, AA0024, 85.8',
        'COMM1000, AA0025, 50.1',
        'COMM1000, AA0026, 45.0',
        'COMM1000, AA0027, 15.5',
        'COMM1000, AA0028, 24.3',
        'COMM1000, AA0029, 77.2',
        'COMM1000, AA0030, 10.3',
        'COMM1000, AA0031, 39.7',
        'COMM1000, AA0032, 92.4',
        'COMM1000, AA0033, 17.1',
        'COMM1000, AA0034, 49.4',
        'COMM1000, AA0035, 56.3',
        'COMM1000, AA0036, 69.9',
        'COMM1000, AA0037, 32.8',
        'COMM1000, AA0038, 20.7',
        'COMM1000, AA0039, 69.3',
        'COMM1000, AA0040, 52.7',
        'COMM1000, AA0041, 43.8',
        'COMM1000, AA0042, 95.0',
        'COMM1000, AA0043, 44.2',
        'COMM1000, AA0044, 77.8',
        'COMM1000, AA0045, 6.6',
        'COMM1000, AA0046, 21.9',
        'COMM1000, AA0047, 26.9',
        'COMM1000, AA0048, 63.2',
        'COMM1000, AA0049, 20.3',
        'COMM1000, AA0050, 13.1',
        'COMM1000, AA0051, 81.6',
        'COMM1000, AA0052, 92.6',
        'COMM1000, AA0053, 42.2',
        'COMM1000, AA0054, 73.0',
        'COMM1000, AA0055, 82.9',
        'COMM1000, AA0056, 75.9',
        'COMM1000, AA0057, 92.1',
        'COMM1000, AA0058, 44.4',
        'COMM1000, AA0059, 95.0',
        'COMM1000, AA0060, 75.7',
        'COMM1000, AA0061, 32.4',
        'COMM1000, AA0062, 33.1',
        'COMM1000, AA0063, 8.0',
        'COMM1000, AA0064, 38.7',
        'COMM1000, AA0065, 44.8',
        'COMM1000, AA0066, 74.0',
        'COMM1000, AA0067, 7.4',
        'COMM1000, AA0068, 16.7',
        'COMM1000, AA0069, 69.7',
        'COMM1000, AA0070, 40.5',
        'COMM1000, AA0071, 0.8',
        'COMM1000, AA0072, 27.5',
        'COMM1000, AA0073, 46.7',
        'COMM1000, AA0074, 61.3',
        'COMM1000, AA0075, 81.9',
        'COMM1000, AA0076, 36.5',
        'COMM1000, AA0077, 14.6',
        'COMM1000, AA0078, 33.6',
        'COMM1000, AA0079, 23.0',
        'COMM1000, AA0080, 66.1',
        'COMM1000, AA0081, 67.9',
        'COMM1000, AA0082, 7.2',
        'COMM1000, AA0083, 61.9',
        'COMM1000, AA0084, 23.7',
        'COMM1000, AA0085, 54.4',
        'COMM1000, AA0086, 19.9',
        'COMM1000, AA0087, 93.8',
        'COMM1000, AA0088, 1.4',
        'COMM1000, AA0089, 48.8',
        'COMM1000, AA0090, 59.9',
        'COMM1000, AA0091, 38.0',
        'COMM1000, AA0092, 67.5',
        'COMM1000, AA0093, 86.3',
        'COMM1000, AA0094, 60.6',
        'COMM1000, AA0095, 40.5',
        'COMM1000, AA0096, 10.1',
        'COMM1000, AA0097, 49.2',
        'COMM1000, AA0098, 20.9',
        'COMM1000, AA0099, 61.6',
        'COMM1000, AA0100, 50.5',
        'COMP1516, AA0001, 47.2',
        'COMP1516, AA0002, 41.5',
        'COMP1516, AA0003, 1.3',
        'COMP1516, AA0004, 95.8',
        'COMP1516, AA0005, 87.6',
        'COMP1516, AA0006, 34.6',
        'COMP1516, AA0007, 48.2',
        'COMP1516, AA0008, 45.6',
        'COMP1516, AA0009, 30.5',
        'COMP1516, AA0010, 56.3',
        'COMP1516, AA0011, 14.5',
        'COMP1516, AA0012, 95.8',
        'COMP1516, AA0013, 21.2',
        'COMP1516, AA0014, 77.0',
        'COMP1516, AA0015, 64.4',
        'COMP1516, AA0016, 82.0',
        'COMP1516, AA0017, 2.4',
        'COMP1516, AA0018, 79.0',
        'COMP1516, AA0019, 96.3',
        'COMP1516, AA0020, 61.5',
        'COMP1516, AA0021, 8.0',
        'COMP1516, AA0022, 25.1',
        'COMP1516, AA0023, 73.3',
        'COMP1516, AA0024, 28.2',
        'COMP1516, AA0025, 46.2',
        'COMP1516, AA0026, 99.5',
        'COMP1516, AA0027, 30.3',
        'COMP1516, AA0028, 5.7',
        'COMP1516, AA0029, 31.4',
        'COMP1516, AA0030, 30.4',
        'COMP1516, AA0031, 4.5',
        'COMP1516, AA0032, 22.7',
        'COMP1516, AA0033, 48.5',
        'COMP1516, AA0034, 46.3',
        'COMP1516, AA0035, 44.3',
        'COMP1516, AA0036, 66.3',
        'COMP1516, AA0037, 36.9',
        'COMP1516, AA0038, 82.8',
        'COMP1516, AA0039, 48.4',
        'COMP1516, AA0040, 11.6',
        'COMP1516, AA0041, 89.5',
        'COMP1516, AA0042, 87.1',
        'COMP1516, AA0043, 51.9',
        'COMP1516, AA0044, 43.5',
        'COMP1516, AA0045, 60.1',
        'COMP1516, AA0046, 36.8',
        'COMP1516, AA0047, 90.2',
        'COMP1516, AA0048, 60.9',
        'COMP1516, AA0049, 89.9',
        'COMP1516, AA0050, 13.8',
        'COMP1516, AA0051, 99.2',
        'COMP1516, AA0052, 31.3',
        'COMP1516, AA0053, 70.7',
        'COMP1516, AA0054, 19.5',
        'COMP1516, AA0055, 60.9',
        'COMP1516, AA0056, 15.2',
        'COMP1516, AA0057, 14.4',
        'COMP1516, AA0058, 63.4',
        'COMP1516, AA0059, 31.8',
        'COMP1516, AA0060, 56.7',
        'COMP1516, AA0061, 49.4',
        'COMP1516, AA0062, 68.9',
        'COMP1516, AA0063, 97.9',
        'COMP1516, AA0064, 31.9',
        'COMP1516, AA0065, 0.1',
        'COMP1516, AA0066, 41.5',
        'COMP1516, AA0067, 94.4',
        'COMP1516, AA0068, 19.8',
        'COMP1516, AA0069, 92.7',
        'COMP1516, AA0070, 44.3',
        'COMP1516, AA0071, 54.1',
        'COMP1516, AA0072, 44.5',
        'COMP1516, AA0073, 65.4',
        'COMP1516, AA0074, 23.6',
        'COMP1516, AA0075, 6.7',
        'COMP1516, AA0076, 45.3',
        'COMP1516, AA0077, 3.5',
        'COMP1516, AA0078, 46.9',
        'COMP1516, AA0079, 96.8',
        'COMP1516, AA0080, 65.3',
        'COMP1516, AA0081, 61.0',
        'COMP1516, AA0082, 29.4',
        'COMP1516, AA0083, 39.3',
        'COMP1516, AA0084, 28.1',
        'COMP1516, AA0085, 62.4',
        'COMP1516, AA0086, 90.7',
        'COMP1516, AA0087, 90.1',
        'COMP1516, AA0088, 64.8',
        'COMP1516, AA0089, 53.1',
        'COMP1516, AA0090, 28.3',
        'COMP1516, AA0091, 87.3',
        'COMP1516, AA0092, 64.7',
        'COMP1516, AA0093, 58.7',
        'COMP1516, AA0094, 11.3',
        'COMP1516, AA0095, 92.7',
        'COMP1516, AA0096, 88.1',
        'COMP1516, AA0097, 13.8',
        'COMP1516, AA0098, 32.1',
        'COMP1516, AA0099, 6.2',
        'COMP1516, AA0100, 37.4',
        'MATH1347, AA0001, 50.2',
        'MATH1347, AA0002, 72.9',
        'MATH1347, AA0003, 3.6',
        'MATH1347, AA0004, 58.4',
        'MATH1347, AA0005, 88.3',
        'MATH1347, AA0006, 72.5',
        'MATH1347, AA0007, 68.4',
        'MATH1347, AA0008, 38.2',
        'MATH1347, AA0009, 81.4',
        'MATH1347, AA0010, 38.1',
        'MATH1347, AA0011, 53.4',
        'MATH1347, AA0012, 93.0',
        'MATH1347, AA0013, 45.7',
        'MATH1347, AA0014, 96.8',
        'MATH1347, AA0015, 16.0',
        'MATH1347, AA0016, 50.3',
        'MATH1347, AA0017, 33.5',
        'MATH1347, AA0018, 24.7',
        'MATH1347, AA0019, 61.4',
        'MATH1347, AA0020, 9.2',
        'MATH1347, AA0021, 37.6',
        'MATH1347, AA0022, 49.0',
        'MATH1347, AA0023, 7.7',
        'MATH1347, AA0024, 30.8',
        'MATH1347, AA0025, 72.5',
        'MATH1347, AA0026, 83.5',
        'MATH1347, AA0027, 49.0',
        'MATH1347, AA0028, 81.4',
        'MATH1347, AA0029, 38.5',
        'MATH1347, AA0030, 95.8',
        'MATH1347, AA0031, 17.9',
        'MATH1347, AA0032, 83.9',
        'MATH1347, AA0033, 72.8',
        'MATH1347, AA0034, 79.6',
        'MATH1347, AA0035, 89.0',
        'MATH1347, AA0036, 6.3',
        'MATH1347, AA0037, 83.1',
        'MATH1347, AA0038, 32.6',
        'MATH1347, AA0039, 44.6',
        'MATH1347, AA0040, 4.0',
        'MATH1347, AA0041, 71.4',
        'MATH1347, AA0042, 14.7',
        'MATH1347, AA0043, 60.2',
        'MATH1347, AA0044, 43.2',
        'MATH1347, AA0045, 49.9',
        'MATH1347, AA0046, 30.2',
        'MATH1347, AA0047, 31.5',
        'MATH1347, AA0048, 6.5',
        'MATH1347, AA0049, 85.6',
        'MATH1347, AA0050, 35.2',
        'MATH1347, AA0051, 6.7',
        'MATH1347, AA0052, 87.5',
        'MATH1347, AA0053, 15.4',
        'MATH1347, AA0054, 42.5',
        'MATH1347, AA0055, 88.9',
        'MATH1347, AA0056, 17.9',
        'MATH1347, AA0057, 40.8',
        'MATH1347, AA0058, 66.8',
        'MATH1347, AA0059, 57.1',
        'MATH1347, AA0060, 63.6',
        'MATH1347, AA0061, 58.5',
        'MATH1347, AA0062, 39.8',
        'MATH1347, AA0063, 5.8',
        'MATH1347, AA0064, 73.1',
        'MATH1347, AA0065, 95.7',
        'MATH1347, AA0066, 18.2',
        'MATH1347, AA0067, 76.5',
        'MATH1347, AA0068, 27.9',
        'MATH1347, AA0069, 73.3',
        'MATH1347, AA0070, 50.3',
        'MATH1347, AA0071, 92.4',
        'MATH1347, AA0072, 75.4',
        'MATH1347, AA0073, 87.5',
        'MATH1347, AA0074, 9.8',
        'MATH1347, AA0075, 89.4',
        'MATH1347, AA0076, 17.6',
        'MATH1347, AA0077, 96.6',
        'MATH1347, AA0078, 4.1',
        'MATH1347, AA0079, 44.1',
        'MATH1347, AA0080, 21.4',
        'MATH1347, AA0081, 0.0',
        'MATH1347, AA0082, 5.0',
        'MATH1347, AA0083, 33.9',
        'MATH1347, AA0084, 64.0',
        'MATH1347, AA0085, 0.1',
        'MATH1347, AA0086, 21.5',
        'MATH1347, AA0087, 70.9',
        'MATH1347, AA0088, 88.4',
        'MATH1347, AA0089, 53.5',
        'MATH1347, AA0090, 7.1',
        'MATH1347, AA0091, 10.0',
        'MATH1347, AA0092, 57.6',
        'MATH1347, AA0093, 66.6',
        'MATH1347, AA0094, 31.4',
        'MATH1347, AA0095, 9.8',
        'MATH1347, AA0096, 13.6',
        'MATH1347, AA0097, 95.0',
        'MATH1347, AA0098, 81.7',
        'MATH1347, AA0099, 39.4',
        'MATH1347, AA0100, 39.6'
    ]

    return students_grades