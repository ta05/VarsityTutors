'''
    Given a binary tree, return the maximum sum of the subtrees
'''

def maxsubtreetotal(t):
    if isinstance(t, int) or isinstance(t, float):
        return t
    else:
        return max(maxsubtreetotal(t[0]), maxsubtreetotal(t[1]), total(t[0]) + total(t[1])) # max(-3,5,2) returns 5 max(2,1,3) returns 3

# Returns the sum of the leaves in the binary subtree t
def total(t):
    if isinstance(t, int) or isinstance(t, float):
        return t
    else:
        return total(t[0]) + total(t[1])