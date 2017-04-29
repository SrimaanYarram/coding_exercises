Unix Command

	1. cal Jan 2009
	2. users, who and w —> who is logged In

Directories 

	3. ls -l (-l option gives more information)
	4. ls PF*.sql
	5. ls -l PF*.sql
	6. ls -a (hidden files)
	7. ls -lrt | grep "^1" 

Display Contents of File

	cat [OPTION] [FILE]...

	1. cat /etc/passwd    			This will show the contents of the file
	2. cat test test1    		    This will display the contents of multiple files
	3. cat >test2         			This will create a new file as test2 and waits for user input (use ctrl +d )
	4. cat songs.txt | more 		This will display the contents based on the screen size
	5. cat songs.txt | less
	6. cat -n song.txt              This will show you the line number of a file contents
	7. cat -e test                  This will show at the end of line and also in space showing $
	8. cat test > test1             This will redirect standard output to another file test1
	9. cat test >> test2  			This will redirect standard output to existing file test2
	10. cat test test1 > test 2     This will redirect multiple file contents to a new test 2 file
	11. cat test.sql | sort         This will sort the contents of file and printsout (not modify the original file)
	12. cat PF-Stage.sql | grep id=123  This will search id=123 in PF-Stage.sql file

Grep --> Used to search text or searches the given file for lines containing a match to the given string or words


	1. grep id=123 /users/syarram/PF-Stage.sql        This command will search for id=123 in PF-Stage.sql file
	2. grep -i boo /users/syarram/PF-Stage.sql 		  This command will search for string ignoring word case boo,Boo,BOO and all other combination in PF-Stage.sql file
	3. grep -r boo /users                             This command will search all the under each directory for a string boo
	4. grep -w "boo" /users/syarram/PF-Stage.sql      This command will search for the exact match
	5. grep -w "word1|word2" /users/syarram/PF-Stage.sql This command will search for the word1 or word2 extact in PF-Stage.sql file
	6. grep -c 'word' /users/syarram/PF-Stage.sql     This command will report number of times that the pattern has been mathced for each file
	7. grep -n 'root' /etc/passwd 					  This command will precede each line of output with the number of the line in the text file from which it was obtained:
	8. grep -v  'select' /users/syarram/PF-Stage.sql  This command will print the lines doesnot have select
	9. grep -i 'Select' /users/syarram/PF-Stage.sql   This command will find the model from PF-Stage.sql
	10. grep --color 'select' /Users/syarram/PF-Stage.sql This command will search and highlight the select string in a color 
	11. grep ^vivek /etc/passwd                       This ^ and $ to force a regex to mathch only at the start or end of line



	Few More Example

	grep 'word1\|word2\|word3' /path/to/file 
	
	### Search all text files ###
	grep 'word*' *.txt
	
	### Search all python files for 'wordA' or 'wordB' ###
	grep 'wordA*'\''wordB' *.py
	grep -E 'word1|word2' *.doc
	grep -e string1 -e string2 *.pl
	egrep "word1|word2" *.c

	grep 'warning\|error\|critical' /var/log/messages
	grep -w 'warning\|error\|critical' /var/log/messages   (exact match)
	egrep -wi --color 'warning|error|critical' /var/log/messages



Find --> Find files using file-name 

	1.	find -iname "MyCProgram.c"            Finding a files using file-name
	2. 	find ~ -empty						  Find all empty files in home directory

	Find using xargs

	### This will first find all java files, from current directory or below and than on each java file look for word "testNIToolsDocs" method

	1. find . -name "*.java" | xargs grep "testNIToolsDocs"


Vim command Examples

    1. vim +143 filename.txt           Opens the file name filename.txt and goes to line 143 
    2. vim +/search-term filename.txt  Go to the first match of the specified.


PS Commands 

	1. ps -ef | more             This will shows you the current running process
	2. ps 			(shows 4 columns PID, TTY (is place where the command is running), TIME (how much time is used by CPU), CMD (is command that run as current Process))
	3. ps -ax      Show all process even the current process is not associated with any TTY
	4. ps -u pungki
	5. ps -aux | less 
	6. ps -aux --sort -pcpu | less  This will sort by the highest CPU utilization in ascending order
	7. ps -aux --sort -pmem | less  This will sort by the highest memory untilization in ascending order
	8. ps -c getty 					This will show processes named getty 
	9. ps -L 1213 					This will processes by thread of processes
	10. ps -axjf 					This will processes in hierarchical form



Advanced Commands

	lsof command will kist down PID of all the process which is using a particular file

	netstat -a | grep "port" and it will list the entire host which is conntected to this host on port 10123




Vi Commands

	1) If you want to set the line number :set number refer the below Example

	vi abc.txt
	:set number 

	2) IF you want to set automatic indentation on 

	vi abc.tex
	:set autoindent

	3) If you want to ignore case on searches

	vi abc.txt
	:set ignorecase


