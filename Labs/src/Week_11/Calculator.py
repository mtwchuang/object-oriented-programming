class Calculator:
    input1 = 0
    input2 = 0
    # constructor
    def __init__(self,input1,input2):
        self.input1 = input1
        self.input2 = input2
    # adder method
    def adder(self):
        return self.input1+self.input2
    # subtract method
    def subtracter(self):
        return self.input1-self.input2
    # multiplier method
    def multiplier(self):
        return self.input1*self.input2
    # divider method
    def divider(self):
        return self.input1/self.input2
        # clear method
    def clear(self):
        input1 = 0
        input2 = 0

# main
def main():
    num1 = int(input("Enter number 1: "))
    num2 = int(input("Enter number 2: "))
    cal = Calculator(num1,num2)
    print("Addition of input: ",cal.adder())
    print("Subtraction of numbers is ",cal.subtracter())
    print("Mutliplication of numbers is ",cal.multiplier())
    print("Division of numbers is ",cal.divider())
    cal.clear()

if __name__ == "__main__":
    main()
