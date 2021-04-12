import json

with open('spells.json') as file:
	data = json.load(file)

j = 0

for x in data:

    name = x['name']
    nameWoSpaces = x['name'].replace(' ', '')
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


    if level == 'cantrip':
        leveln = 'cantrip'
    if level == 1:
        leveln = 'one'
    if level == 2:
        leveln = 'two'
    if level == 3:
        leveln = 'three'
    if level == 4:
        leveln = 'four'
    if level == 5:
        leveln = 'five'
    if level == 6:
        leveln = 'six'
    if level == 7:
        leveln = 'seven'
    if level == 8:
        leveln = 'eight'
    if level == 9:
        leveln = 'nine'


    if level == 'cantrip':
        a = 'package spells.' + leveln + ';\n'





    a = 'package spells.' + leveln + ';\n'
    a += '\n'
    a += 'import constants.TimeUnits;\n'
    a += 'import helpers.CastingTime;\n'
    a += 'import helpers.Duration;\n'
    a += 'import helpers.Range;\n'
    a += 'import helpers.Target;\n'
    a += 'import spells.Components;\n'
    a += 'import spells.Schools;\n'
    a += 'import spells.Spell;\n'
    a += '\n'
    a += 'public class '+ nameWoSpaces + ' extends Spell {\n'
    a += '\n'
    a += '    public ' + nameWoSpaces + '() {\n'
    a += '        name = "' + name + '";\n'
    if level == 'cantrip':
        a += '        level = ' + str(0) + ';\n'
    else:
        a += '        level = ' + level + ';\n'
    a += '        school = Schools.' + school.upper() + ';\n'
    a += '        components = new Components[]{\n'
    for c in components:
        if c == 'V':
            a += '                Components.VERBAL,\n'
        if c == 'S':
            a += '                Components.SOMATIC,\n'
    if x['components']['material'] == True:
            a += '                Components.MATERIAL\n'
    a += '        };\n'
    if x['components']['material'] == True:
         if len(material) == 1:
            a += '        String material = "' + material[0] + '";\n'
         else:
            i = 0
            for m in material:
                a += '        String material' + str(i) + ' = "' + material[i] + '";\n'



    if 'bonus action' in castingTime or 'bonus actions' in castingTime:
        ct = castingTime.split(' ')
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.BONUS_ACTION);\n'
    if 'reaction' in castingTime or 'reactions' in castingTime:
        ct = castingTime.split(' ')
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.REACTION);\n'
        a += '//TODO: Implement reaction condition: ' + ct[2]
    if 'action' in castingTime or 'actions' in castingTime and 'bonus' not in castingTime:
        ct = castingTime.split(' ')
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.ACTION);\n'
    if 'second' in castingTime or 'seconds' in castingTime:
            ct = castingTime.split(' ')
            a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.SECOND);\n'
    if 'minute' in castingTime or 'minutes' in castingTime:
            ct = castingTime.split(' ')
            a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.MINUTE);\n'
    if 'hour' in castingTime or 'hours' in castingTime:
            ct = castingTime.split(' ')
            a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.HOUR);\n'
    if 'day' in castingTime or 'days' in castingTime:
            ct = castingTime.split(' ')
            a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.DAY);\n'




#     a += '        duration = new Duration(' + TimeUnits.INSTANTANEOUS + ');\n'
#
#     a += '        range = new Range(' + str(90) + ');\n'
#
#     a += '        target = new Target(' + constants.Target.CREATURE + ');\n'






    a += '        ritual = false;\n'
    a += '        description = "' + description + '";\n'
    if 'higher_levels' in x:
        a += '        higherLevels = "' + higherLevels + '";\n'
    a += '    }\n'
    a += '\n'
    a += '}\n'


#     print('===""" =========================')
#     print(casting """Time)
    j += 1

print(j)
