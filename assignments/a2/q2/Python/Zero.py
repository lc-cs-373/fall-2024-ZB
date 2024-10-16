#Zero:top#
#Zero:import#

# <bit>Zero ::= <ZERO>
class Zero(Bit): #Zero:class#

    className = "Zero"
    ruleString = "<bit>Zero ::= <ZERO>"
    zero = None

    def __init__(zero):
        #Zero:init#
        self.zero = zero

#Zero#
