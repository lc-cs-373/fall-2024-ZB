#NumsSymbol:top#
#NumsSymbol:import#

# <nums>:NumsSymbol ::= SYMBOL <nums>
class NumsSymbol(Nums): #NumsSymbol:class#

    className = "NumsSymbol"
    ruleString = "<nums>:NumsSymbol ::= SYMBOL <nums>"
    nums = None

    def __init__(nums):
        #NumsSymbol:init#
        self.nums = nums

#NumsSymbol#
