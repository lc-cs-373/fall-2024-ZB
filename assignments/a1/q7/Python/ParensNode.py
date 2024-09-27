#ParensNode:top#
#ParensNode:import#

# <parens>ParensNode ::= LP <parens>p1 RP <parens>p2
class ParensNode(Parens): #ParensNode:class#

    className = "ParensNode"
    ruleString = "<parens>ParensNode ::= LP <parens>p1 RP <parens>p2"
    p1 = None
    p2 = None

    def __init__(p1, p2):
        #ParensNode:init#
        self.p1 = p1
        self.p2 = p2

#ParensNode#
