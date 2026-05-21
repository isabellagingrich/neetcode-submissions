class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        listOfDuplicates = []
        print(f"nums: {nums}")
        for item in nums: 
            print(f"item: {item} list: {listOfDuplicates}")
            if item in listOfDuplicates:
                return True
            else:
                listOfDuplicates.append(item)
        return False

        