#BitZero:top#
#BitZero:import#

# <bit>BitZero ::= <ZERO>
class BitZero(Bit): #BitZero:class#

    className = "BitZero"
    ruleString = "<bit>BitZero ::= <ZERO>"
    zero = None

    def __init__(zero):
        #BitZero:init#
        self.zero = zero

#BitZero#
