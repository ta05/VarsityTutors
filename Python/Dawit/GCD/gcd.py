import glob

def computeGCD(f): 
    print(f, ':')
    file = open(f, 'r')
    lines = file.readlines()

    # If the file doesn't exist or the file is empty
    if not lines or len(lines) == 0:
        print('ERROR: file', f, 'is empty')
        return
    nums=[]
    for line in lines:
        line=line.strip()

        # If the first character in the line is a '#' then it's a comment, so we ignore and go to next cycle in the loop.
        if line[0] == '#':
            continue

        # If the line has a comma, then we split on the comma and append each element to our nums list.
        if ',' in line:
            x , y = line.split(",")
            nums.append(x.strip())
            nums.append(y.strip())
        
        # Otherwise, we just append the whole line to the nums list.
        else:
            nums.append(line)
    
    # The nums list will only have two numbers. First we check if our list has two elements.
    if len(nums) !=2:
        print('ERROR: file', f, 'is not legal format')
        return
    
    # Now we check if both elements are numbers.
    if nums[0].isdigit() and nums[1].isdigit():
        nums=[int(nums[0]),int(nums[1])]      
        if nums:
            x,y = nums

            # If either number is a 0, then we cannot compute the gcd.
            if x == 0 or y == 0 :
                print('ERROR: file', f, 'can not do GCD of 0')
                return
            while True:
                if x % y == 0:
                    return y
                else:
                    temp = y
                    y = x % y
                    x = temp
        else:
            print('ERROR: file', f, 'is not legal format')
            return
    else:
        print('ERROR: file', f, 'is not legal format')
        return


for f in glob.glob("./Dawit/GCD/data/*.dat"):
    print(computeGCD(f))

