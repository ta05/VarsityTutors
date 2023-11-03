def permute(nums: list[int]) -> list[list[int]]:
    permutations = []

    def permute_helper(nums: list[int], permutation: list[int]) -> None:
        if not nums:
            permutations.append(permutation)
            return
        
        nums_seen = set()
        for i, num in enumerate(nums):
            if num not in nums_seen:
                nums_seen.add(num)
                permute_helper(nums[:i] + nums[i+1:], permutation + [num])
    
    permute_helper(nums, [])
    return permutations


def tiles(n: int, v: list[int], lst: list[list[int]]) -> list[list[int]]:
    all_permutations = []
    v.sort()

    def permutation_sum(target: int, nums: list[int], combination: list[int]) -> None:
        if target <= 0:
            if target == 0:
                all_permutations.extend(permute(combination))
            return
        
        if not nums:
            return
        
        permutation_sum(target - nums[0], nums, combination + [nums[0]])
        permutation_sum(target, nums[1:], combination)

    permutation_sum(n, v, [])
    return all_permutations


def main():
    n = 6
    v = [1, 2, 3]
    print(tiles(n, v, [[i] for i in v]))
    for i in tiles(n, v, [[i] for i in v]):
        print(sum(i), end="")


if __name__ == "__main__":
    main()
