## Assignment question numbers with the file names

-   Q-1 WordSort.java
-   Q-2 WordCount.java
-   Q-3 DoubleToString.java
-   Q-4 CheckCharAndDigits.java
-   Q-5
-   Q-6 CompareTwoStrings.java
-   Q-7 CheckAInString.java
-   Q-8 StringStartsWithSubstring.java
-   Q-9 RemoveInformationFromRCC.java
-   Q-10 TakeOutChars.java
-   Q-11 LowerUpperToggleCase.java
-   Q-12 Palindrome.java
-   Q-13 InsertCharAtBeginning.java
-   Q-14 OccurenceOfChar.java
-   Q-15 PrintPatterns.java
-   Q-16 HighestFreqencyWord.java

The `runjava` is only for automate task and NOT related to the assignment.

## How to use the `runjava` file

**YOU NEED BASH/SH TO USE RUN THIS PROGRAM ON TERMINAL**

    ### RUNJAVA V$version
    > This file is created for the ease of compiling a java file and move it to the 'outdir'
    > The 'outdir' is the 'classFiles' folder
    > Rather than that this file has no use

    ### USAGE
        0) To run this file ->
        ./runjava FILENAME OPTION

        FILENAME: Name of the java file
        ARG: One of these five options [-a] [-c] [-h] [-r] [-s]

    ### OPTIONS
        -a or --all -> Compile all the java files in present directory
        -c or --compile -> Compile given java file as FILENAME
        -h or --help -> See the manual page
        -r or --run -> Compile and run the given java file as FILENAME at the same time
        -s or --set -> Set folder for .class files (default is 'classFiles')

    ### HOW TO RUN
        - To compile a java file ->
        type ./runjava file_name.java -c
        The compiled class file will be moved to the 'outdir' (classFiles) folder

        - To run java (class) file ->
        type ./runjava file_name
        *NOTE: .class extension is optional, program will add if not present on the argument

        - To compile and run a java file ->
        type ./runjava file_name.java -r
        > This option is recommended to use most of the time

        - To compile all the java files at the same time (but don't run them) ->
        type ./runjava -a

        - To set a different folder for .class files ->
        type ./runjava -s FolderName
        *NOTE: If the above command is not set then the DEFAULT folder is 'classFiles'
