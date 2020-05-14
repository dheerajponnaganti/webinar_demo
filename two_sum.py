def twoSum(nums, target):
        
        N = len(nums)
        for i in range(N):
                for j in range(i + 1, N):
                        if nums[i] + nums[j] == target:
                                return [i, j]
        
        return [0, 0]
        
