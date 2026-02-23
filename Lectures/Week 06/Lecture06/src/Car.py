class Car:
    def __init__(self, make = "Lexus", model = "LFA", year = 2010):
        self.make = make
        self.model = model
        self.year = year
    
    def get_make(self):
        return self.make
    
    def set_make(self, make):
        self.make = make
    
    def start(self):
        print(f"Started the {self.make} {self.model}")

    def stop(self):
        print("Car stopped")
    
    def drive(self, speed):
        print(f"Car driving at {speed}")