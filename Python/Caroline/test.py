from fines import demerit, fine

print('$ {}'.format(fine(50, 55, 'school')))
print('$ {}'.format(fine(35, 50, 'residential')))
print('$ {}'.format(fine(60, 65)))
print('$ {}'.format(fine(50, 80, 'work')))
print('$ {}'.format(fine(40, 50, 'work')))
print('$ {}'.format(fine(45, 45)))

print()

print('{} points'.format(demerit(50, 55)))
print('{} points'.format(demerit(35, 50)))
print('{} points'.format(demerit(60, 65)))
print('{} points'.format(demerit(50, 80)))
print('{} points'.format(demerit(40, 50)))
print('{} points'.format(demerit(45, 45)))

