#ListMore:top#
#ListMore:import#

# <com>:ListMore ::= COMMA <nums>
class ListMore(Com): #ListMore:class#

    className = "ListMore"
    ruleString = "<com>:ListMore ::= COMMA <nums>"
    nums = None

    def __init__(nums):
        #ListMore:init#
        self.nums = nums

#ListMore#
