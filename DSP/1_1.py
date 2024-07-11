Subjects = [f"Subject{i}" for i in range(1, 11)]
Subjects += ["Elective1", "Elective2", "Elective3", "Elective4", "Elective5"]
Subjects += ["Duplicate", "Duplicate", "Duplicate"]
duplicate_subject = "Duplicate"
while duplicate_subject in Subjects:
    Subjects.remove(duplicate_subject)

def remove_range(i1, i2, list_to_modify):
    del list_to_modify[i1:i2+1]
    return list_to_modify

Subjects = remove_range(2, 4, Subjects)

Subjects.sort()
Subjects.reverse()
Subjects.pop(4)

total_elements = len(Subjects)
Subjects.clear()

my_tuple = ("Math", "Physics", "Chemistry", "Biology")
my_list = list(my_tuple)
my_list.remove("Biology")
my_list.append("Computer Science")
my_tuple = tuple(my_list)