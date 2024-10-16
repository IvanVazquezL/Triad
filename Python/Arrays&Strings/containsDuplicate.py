class Solution(object):
    def containsDuplicate(self, nums):
        my_set = set(nums)
        return len(my_set) != len(nums)