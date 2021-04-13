import json

with open('spells.json') as file:
	data = json.load(file)

j = 0

for x in data:

    name = x['name'].replace("'", "")
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
    a += 'import constants.Target;\n'
    a += 'import helpers.CastingTime;\n'
    a += 'import helpers.Duration;\n'
    a += 'import helpers.Range;\n'
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


    castingCheck = False
    ct = castingTime.split(' ')
    if ct[1] == 'bonus':
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.BONUS_ACTION);\n'
        castingCheck = True
    if ct[1] == 'reaction' or ct[1] == 'reactions':
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.REACTION);\n'
        a += '//TODO: Implement reaction condition: ' + ct[2] + '\n'
        castingCheck = True
    if ct[1] == 'action' or ct[1] == 'actions':
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.ACTION);\n'
        castingCheck = True
    if 'second' in castingTime or 'seconds' in castingTime:
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.SECOND);\n'
        castingCheck = True
    if 'minute' in castingTime or 'minutes' in castingTime:
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.MINUTE);\n'
        castingCheck = True
    if 'hour' in castingTime or 'hours' in castingTime:
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.HOUR);\n'
        castingCheck = True
    if 'day' in castingTime or 'days' in castingTime:
        a += '        castingTime = new CastingTime(' + ct[0] + ', TimeUnits.DAY);\n'
        castingCheck = True
    if castingCheck == False:
        a += '//TODO: CHECK CASTING TIME\n'

    concCheck = False
    d = duration.split(' ')
    if 'Concentration' in duration:
        if d[-1] == 'second' or d[-1] == 'seconds':
            a += '        duration = new Duration(true, ' + d[-2] + ', TimeUnits.SECOND);\n'
            concCheck = True
        if d[-1] == 'minute' or d[-1] == 'minutes':
            a += '        duration = new Duration(true, ' + d[-2] + ', TimeUnits.MINUTE);\n'
            concCheck = True
        if d[-1] == 'hour' or d[-1] == 'hour':
            a += '        duration = new Duration(true, ' + d[-2] + ', TimeUnits.HOUR);\n'
            concCheck = True
        if d[-1] == 'day' or d[-1] == 'days':
            a += '        duration = new Duration(true, ' + d[-2] + ', TimeUnits.DAY);\n'
            concCheck = True
        if d[-1] == 'round' or d[-1] == 'rounds':
            a += '        duration = new Duration(true, ' + d[-2] + ', TimeUnits.ROUND);\n'
            concCheck = True
    if 'Instantaneous' in duration and 'or' not in duration:
        a += '        duration = new Duration(TimeUnits.INSTANTANEOUS);\n'
        concCheck = True
    if 'Instantaneous' in duration and 'or' in duration:
        a += '        duration = new Duration(TimeUnits.INSTANTANEOUS);\n'
        concCheck = True
        a += '//TODO: Check duration\n'
    if 'round' in duration and 'Concentration' not in duration:
        a += '        duration = new Duration(' + d[0] + ', TimeUnits.ROUND);\n'
        concCheck = True
    if 'Untill Dispelled' in duration:
        a += '//TODO: Check duration\n'
        concCheck = True
    if 'Special' in duration:
        a += '//TODO: Check duration\n'

    if concCheck == False:
        a += '//TODO: CHECK DURATION\n'

    rangeCheck = False
    rs = r.split(' ')
    if 'Self' in r:
        if '(' in rs:
            if 'line' in r:
                a += '        range = new Range(Target.SELF, ' + rs[1] + ', AreasOfEffect.LINE);\n'
                rangeCheck = True
            if 'sphere' in r:
                a += '        range = new Range(Target.SELF, ' + rs[1] + ', AreasOfEffect.SPHERE);\n'
                rangeCheck = True
            if 'radius' in r:
                a += '        range = new Range(Target.SELF, ' + rs[1] + ', AreasOfEffect.RADIUS);\n'
                rangeCheck = True
            if 'cone' in r:
                a += '        range = new Range(Target.SELF, ' + rs[1] + ', AreasOfEffect.CONE);\n'
                rangeCheck = True
            if 'cube' in r:
                a += '        range = new Range(Target.SELF, ' + rs[1] + ', AreasOfEffect.CUBE);\n'
                rangeCheck = True
        if '(' not in rs:
            a += '        range = new Range(Target.SELF);\n'
            rangeCheck = True


    if 'Touch' in r:
        a += '        range = new Range(0);\n'
        rangeCheck = True

    if 'feet' in r:
        a += '        range = new Range(' + rs[0] + ');\n'
        rangeCheck = True
    if 'mile' in r and 'Self' not in r:
        a += '        range = new Range(' + rs[1] + ', DistanceUnits.MILE);\n'
        rangeCheck = True

    if rangeCheck == False:
        a += '//TODO: Check Range\n'

    a += '        target = new Target(Aberbo);\n'

    a += '        ritual = ' + str(ritual).lower() + ';\n'
    a += '        description = "' + description.replace('\n', '') + '";\n'
    if 'higher_levels' in x:
        a += '        higherLevels = "' + higherLevels + '";\n'
    a += '    }\n'
    a += '\n'
    a += '}\n'


#     print('============================')
#     print(duration)
    if level == '9':
        j += 1
        print(name  )
        f = open(nameWoSpaces + '.java', 'w')
        f.write(a)
        f.close()

print(j)
