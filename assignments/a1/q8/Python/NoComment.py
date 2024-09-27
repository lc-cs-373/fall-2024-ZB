#NoComment:top#
#NoComment:import#

# <line>NoComment ::= <rule>
class NoComment(Line): #NoComment:class#

    className = "NoComment"
    ruleString = "<line>NoComment ::= <rule>"
    rule = None

    def __init__(rule):
        #NoComment:init#
        self.rule = rule

#NoComment#
