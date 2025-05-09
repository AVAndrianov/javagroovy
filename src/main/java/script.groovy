println "Groovy script"
def list = [1, 3, 4, 5, 1, 5, 4]
def map = [:]
for (i in list) {
    def iString = i.toString()
    def iMap = [(iString): map.get((iString)) == null ? 1 : map.get((iString)) + 1]
    map.putAll(iMap)
}
print map
