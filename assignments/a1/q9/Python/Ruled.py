#Ruled:top#
#Ruled:import#

# <line>Ruled ::= <rule>
class Ruled(Line): #Ruled:class#

    className = "Ruled"
    ruleString = "<line>Ruled ::= <rule>"
    rule = None

    def __init__(rule):
        #Ruled:init#
        self.rule = rule

#Ruled#
