#NumsSome:top#
#NumsSome:import#

# <nums>:NumsSome ::= NUM <nums>
class NumsSome(Nums): #NumsSome:class#

    className = "NumsSome"
    ruleString = "<nums>:NumsSome ::= NUM <nums>"
    nums = None

    def __init__(nums):
        #NumsSome:init#
        self.nums = nums

#NumsSome#
