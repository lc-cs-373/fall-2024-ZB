#RuleLine:top#
#RuleLine:import#

# <line>RuleLine ::= <rule>
class RuleLine(Line): #RuleLine:class#

    className = "RuleLine"
    ruleString = "<line>RuleLine ::= <rule>"
    rule = None

    def __init__(rule):
        #RuleLine:init#
        self.rule = rule

#RuleLine#
