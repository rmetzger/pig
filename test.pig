A = load '/etc/passwd' using PigStorage(':'); 
B = foreach A generate $0 as id; 
dump B; 


/*
#-----------------------------------------------
# New Logical Plan:
#-----------------------------------------------
B: (Name: LOStore Schema: id#3:bytearray)
|
|---B: (Name: LOForEach Schema: id#3:bytearray)
    |   |
    |   (Name: LOGenerate[false] Schema: id#3:bytearray)ColumnPrune:OutputUids=[3]ColumnPrune:InputUids=[]
    |   |   |
    |   |   (Name: Project Type: bytearray Uid: 3 Input: 0 Column: (*))
    |   |
    |   |---(Name: LOInnerLoad[0] Schema: #-1:bytearray)
    |
    |---A: (Name: LOLoad Schema: null)RequiredFields:null
*/