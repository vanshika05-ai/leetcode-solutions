class Solution:
    def generateValidStrings(self, n: int, k: int) -> list[str]:
        result = []

        def dfs(index, current_string, cost, prev_one):
            if cost > k:
                return
            if index == n:
                result.append(current_string)
                return

            dfs(index+1,current_string+"0",cost,False)
            if not prev_one:
                dfs(index+1,current_string+"1", cost+index,True)


        dfs(0,"",0,False)
        return result
        