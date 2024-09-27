#NumsNode:top#
#NumsNode:import#

# <nums>:NumsNode ::= NUM <nums>
class NumsNode(Nums): #NumsNode:class#

    className = "NumsNode"
    ruleString = "<nums>:NumsNode ::= NUM <nums>"
    nums = None

    def __init__(nums):
        #NumsNode:init#
        self.nums = nums

#NumsNode#
