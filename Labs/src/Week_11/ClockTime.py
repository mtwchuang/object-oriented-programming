# 24 hour format
class ClockTime:
    hours = 0
    minutes = 0
    seconds = 0
    def setHours(self,h):
        self.hours = h
    def setMinutes(self,m):
        self.minutes=m
    def setSeconds(self,s):
        self.seconds=s
    def setTime(self,h,m,s):
        self.hours=h
        self.minutes=m
        self.seconds=s
    def showTime(self):
        print(self.hours,":",self.minutes,":",self.seconds)


def main():
    # main
    ct = ClockTime()
    input_hrs = -1
    input_min = -1
    input_sec = -1
    while input_hrs < 0 or input_hrs >23:
        input_hrs = int(input("Enter in clock hours: "))
    while input_min < 0 or input_min > 60:
        input_min = int(input("Enter in clock minutes: "))
    while input_sec < 0 or input_sec > 60:
        input_sec = int(input("Enter in clock seconds: "))
    ct.setTime(input_hrs,input_min,input_sec)
    ct.showTime()

if __name__ == "__main__":
    main()