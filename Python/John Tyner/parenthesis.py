def valid_paren(s):
    stack = []
    for ch in s:
        if ch == '{' or ch == '(' or ch == '[':
            stack.append(ch)
        elif len(stack) > 0:
            punc = stack.pop()
            if (punc == '{' and ch != '}') or (punc == '(' and ch != ')') or (punc == '[' and ch != ']'):
                return False
        else:
            return False
    
    return len(stack) == 0

print(valid_paren('{[]{()}}'))
print(valid_paren('[{}{})(]'))
print(valid_paren('((()'))