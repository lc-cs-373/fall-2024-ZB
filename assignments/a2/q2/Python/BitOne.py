#BitOne:top#
#BitOne:import#

# <bit>BitOne ::= <ONE>
class BitOne(Bit): #BitOne:class#

    className = "BitOne"
    ruleString = "<bit>BitOne ::= <ONE>"
    one = None

    def __init__(one):
        #BitOne:init#
        self.one = one

#BitOne#
