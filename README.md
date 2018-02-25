# Input-Output Tasks
### by Charin Tantrakul

| Tables                                        | Time          |
| --------------------------------------------- |:-------------:|
| Read file 1-char at a time to String          | 0.891649      |
| Read file 1-char at a time to StringBuilder   | 0.015356      |
| Read file line at a time using BufferedReader | 0.020761      |


## Explanation of Results

StringBuilder faster than String Because StringBuilder when appending StringBuilder will append to object directly by '.append'

but in String will use '+' to appending that mean String must create new object to append.

And Read file using BufferedReader read 1 line but String read 1 char that why

Using BufferedReader faster than String
