import json

with open('spells.json') as file:
	data = json.load(file)

superClass = ''

durationQty = 'asd'
durationQty_ = 'asd'

h = 0

for x in data:

    print(x)

    name = x['name']
    level = x['level']
    school = x['school']
    components = x['components']['raw']
    if x['components']['material'] == True:
        material = x['components']['materials_needed']
    castingTime = x['casting_time']
    duration = x['duration']
    r = x['range']
    ritual = x['ritual']
    description = x['description']
    if 'higher_levels' in x:
        higherLevels = x['higher_levels']

    h += 1

print(h)



def classBuilder():
    print("package spells." +  + "\n")
    print("\n")
    print("import ")
    print("\n")
    print("public class " +  + "extends Spell {")
    print("\n")
    print("\n")
    print("    public " + name + "() {")
    print("\n")
    print('name = "' + name + '";')
    print("\n")
    print('school = Schools.' + upper(school) + ';')
    print("\n")
    print('components = new Components[] {')
    print("\n")
    for c in components:
        print('Components.' + c + ',')
    print("\n")
    print('};')
    if 'M' in components:
        print('String material = "' + material + '";')
    print("\n")
    print('castingTime = new CastingTime(' + )



















