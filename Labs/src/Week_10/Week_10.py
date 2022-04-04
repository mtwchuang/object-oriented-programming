# custom switch function for course code
def switch(course_code):
    course_dict = {
        "CSC2902":"Career and Professional Development",
        "CSC1006":"Mathematics II",
        "CSC1007":"Operating System",
        "CSC1008":"Data Structures and Algorithms",
        "CSC1009":"Object Oriented Programming"
    }
    course_name = course_dict.get(course_code)
    if course_name is not None:
        print(course_dict.get(course_code))
    else:
        print("Course code does not exist")

# Question 1, print message
def tutorialQ1():
    print("Hello Glasgow")

# Question 2 take input
def tutorialQ2():
    x = int(input('Enter 1st number: '))
    y = int(input('Enter 2nd number: '))
    # print average
    print((x+y)/2)

# Question 3a
def tutorialQ3a():
    course_code = str(input("Enter course code: "))
    switch(course_code)

# Question 3b
def tutorialQ3b():
    for i in range(102, 65, -1):
        if i%2!=0:
            print(i)

# main
def main():
    tutorialQ1()
    tutorialQ2()
    tutorialQ3a()
    tutorialQ3b()

if __name__ == "__main__":
    main()