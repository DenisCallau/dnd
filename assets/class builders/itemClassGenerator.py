import json

with open('Usable.json', 'r') as js:

	parsed = json.load(js)

for x in parsed:

	print(x["name"])



	f = open(x['name'] + '.java', 'x')
	f.write('package items.usable;\n')
	f.write('\n')

	f.write('import constants.CurrencyTypes;\n')
	f.write('import helpers.Currency;\n')
	f.write('import constants.MeasureUnits;\n')
	f.write('import helpers.Measure;\n')
	f.write('\n')

	f.write('public class ' + x['name'] + ' extends UsableItem {\n')
	f.write('\n')

	f.write('	public ' + x['name'] + '() {\n')
	f.write('		name = "' + x['name'] + '";\n')

	if(x['priceType'] == 'cp'):
		type = 'COPPER'
	if(x['priceType'] == 'sp'):
		type = 'SILVER'
	if(x['priceType'] == 'gp'):
		type = 'GOLD'


	f.write('		price = new Currency(' + str(x['price']) + ', CurrencyTypes.' + type + ');\n')

	if(x['weight'] != 0):
		f.write('		weight = new Measure(' + str(x['weight']) + ', MeasureUnits.POUND);\n')
	else:
		f.write('		weight = new Measure(' + str(x['weight']) + ', MeasureUnits.NULL);\n')

	f.write('		description = "";\n')
	
	f.write('	}\n')
	f.write('\n')
	
	f.write('}\n')


