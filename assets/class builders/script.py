import json

with open('spells.json') as file:
	data = json.load(file)

superClass = ''

durationQty = 'asd'
durationQty_ = 'asd'

for x in data:

	className = x['name'].replace(' ', '')
	# castingTime = x['casting_time'].split()[0]
	# castingType = x['casting_time'].split()[1]
	components = x['components']['raw']
	if x['components']['material']:
		material = x['components']['materials_needed']
	description = x['description']

	# durationTime = x['duration'].split()[1]
	# if durationTime == 'hour' or durationTime == 'hours' or durationTime == 'minute' or durationTime == 'minutes' or durationTime == 'day' or durationTime == 'days':
	# 	durationTime = x['duration'].split()[0]
	# durationType = durationTime = x['duration'].split()[1]
	duration = x['duration']

	if x['level'] == 'cantrip':
		level = 'cantrip'
	else:
		level = x['level']


	rang = x['range']#x['range'].split()[0]
	# rangeType = x['range'].split()[1]
	ritual = x['ritual']
	school = x['school']

	# print('*****************')
	# print(className)
	# print(castingTime + ' ' + castingType)
	# print(components)
	# if x['components']['material']:
	# 	print(material)
	# print(description)
	# print(duration)
	# # print(durationTime + ' ' + durationType)
	# print(level)
	# # print(rang + ' ' + rangeType)
	# print(rang)
	# print(ritual)
	# print(school)
	# print('*****************')
	# print(' ')


	print(x['duration'])





	# somatic = x['components']['somatic']
	# verbal = x['components']['verbal']
	# material = x['components']['material']
	# if material:
	# 	materialNeeded = x['components']['materials_needed']

	# description = x['description']

	# if 'or' in x['duration']:
	# 	durationType = "ERROR"	
	# if 'up to' in x['duration']:
	# 	durationType = 'CONCENTRATION'
	# 	duration = x['duration'].split()[3]
	# 	durationQty_ = x['duration'].split()[4]
	# 	if durationQty_ == 'hour' or durationQty_ == 'hours':
	# 		durationQty = 'HOUR'
	# 	if durationQty_ == 'minute' or durationQty_ == 'minutes':
	# 		durationQty = 'MINUTE'
	# 	if durationQty_ == 'round' or durationQty_ == 'rounds':
	# 		durationQty = 'ROUND'
	# 	if durationQty_ == 'day' or durationQty_ == 'days':
	# 		durationQty = 'DAY'
	# 	else:
	# 		durationQty = 'NULL'
	# if x['duration'] == 'Instantaneous':
	# 	durationType = 'INSTANTANEOUS'
	# if x['duration']  == 'Until dispelled':
	# 	durationType = 'UNTIL_DISPELLED'
	# if x['duration']  == 'Special':
	# 	durationType = 'SPECIAL'

	# if 'cantrip' in x['level']:
	# 	level = 'cantrip'
	# else:
	# 	level = x['level']

	# name = x['name']

	# if 'feet' in x['range']:
	# 	rangeType = 'FEET'
	# 	rangeQty = x['range'].split()[0]
	# if 'self' in x['range']:
	# 	rangeType = 'SELF'
	# if 'Touch' in x['range']:
	# 	rangeType = 'TOUCH'
	
	# ritual = x['ritual']

	# school = x['school']

	# conjType = x['type'].split()[0]


	# print('**********************')
	# print(name)
	# print(castingTime + ' ' + castingTimeType)
	# print('Verbal: ' + str(verbal))
	# print('Somatic: ' + str(somatic))
	# print('Material: ' + str(material))
	# if material:
	# 	print('Material: ' + materialNeeded)
	# print(description)
	# print(durationQty + ' ' + durationType)
	# print('**********************')
	# print('')





	# if durationQty_ != 'hour' and durationQty_ != 'hours' and durationQty_ != 'minute' and durationQty_ != 'minutes':
	# 	print(x['name'])
	# 	print(durationQty_)
	# 	print(durationQty)
	# 	print(' ')
