import jpy
jpy.create_jvm([])
File = jpy.get_type('java.io.File')
file = File('jpytestfolder')
if file.mkdir():
  print('dir created !!')
else: 
  print('dir exist !!')

