# Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
# GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

# example:
# input: ["ghhandle1", "ghhandle2"]
# output: ["https://github.com/greenfox-academy/ghhandle1", "https://github.com/greenfox-academy/ghhandle2"]

names = ["ghhandle1", "ghhandle2"]
print(urls_from_handles(names))
