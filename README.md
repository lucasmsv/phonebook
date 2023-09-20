
# Phonebook

This simple project saves a person's data in a list. The data requested by the system is: name and telephone number. But the system saves, along with the user's data, their city, which is automatically retrieved according to the area code entered on the phone. Registration is only carried out when the telephone insertion mask is done correctly, otherwise the system will report an error.


## Demonstration

Name: João \
Telephone: 99999999999 \
[Erro]

Name: João \
Telephone: 99 9 9999-9999 \
[Registration completed successfully]

Name: Maria \
Telephone: 89 9 9999-0000 \
[Registration completed successfully]

Phonebook (name, telephone, city): \
| João | 99 9 9999-9999 | Brazil | \
| Maria | 89 9 9999-0000 | Canada |

## Learnings

List: How to save data in a list. \
Regex: How to perform a check for correct data insertion. \
Repeat loop: how to use for to display list data correctly.
