# One-to-One & One-to-Many mapping with only back reference
i.e., Parent doesn't know its children, only children have its parent information.

# Employee
{
  "firstName": "Balamurugan",
  "lastName": "Boominathan"
}

# Address
{
	"street": "Madhava Kadu",
	"city": "Erode",
	"state": "Tamilnadu"
}

# Qualification
[
  {
    "course": "B.E - CSE",
    "percentage": 75.86,
    "yearOfCompletion": 2010,
    "university": "Anna University"
  },
  {
    "course": "12th",
    "percentage": 86.12,
    "yearOfCompletion": 2006,
    "university": "State Board"
  },
  {
    "course": "10th",
    "percentage": 83.33,
    "yearOfCompletion": 2004,
    "university": "Matriculation"
  }
]


Reference:
https://launchschool.com/books/sql/read/table_relationships