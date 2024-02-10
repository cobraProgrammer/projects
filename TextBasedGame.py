# Michael Finley Project Two Text Based Game
import sys

# Global variables
inventory = []

# Data structure for the map of places and items,
# not in main if it was would have to pass the data structure to every function which be inefficient
rooms = {
    'Foyer': {'East': 'Grand Hall'},
    'Grand Hall': {'South': 'Library', 'North': 'Kitchen', 'East': 'Armory', 'item': 'Sword'},
    'Kitchen': {'East': 'Cellar', 'South': 'Grand Hall','item': 'Potion'},
    'Bedroom': {'West': 'Library', 'item': 'Armor'},
    'Library': {'North': 'Grand Hall', 'East': 'Bedroom', 'item': 'Crossbow'},
    'Armory': {'West': 'Grand Hall', 'North': 'Tower', 'item': 'Shield'},
    'Cellar': {'West': 'Kitchen', 'item': 'Scroll of Hold Monster'},
    'Tower': {'South': 'Armory'}
}


# function to move from room to room
def move_room(room, move):
    room = rooms[room][move]
    return room


# Function to get moves available from the current room
def get_moves(room):
    total_moves = ' '.join(rooms.get(room))
    return total_moves


# Adds item to inventory from a get command
def get_item(room):
    inventory.append(rooms[room].get('item'))
    val = rooms[room].pop('item')
    inventory.sort()


# Test the conditions for winning or losing based on the being in the Tower and having all the items or not
def has_won():

    if len(inventory) == 6:
        print('After a long battle and using all the items collect you have defeated the Beholder')
        print('Congratulations! You have won!')
        print('Thanks for playing the game. Hope you enjoyed it.')
        sys.exit(1)
    else:
        print('You did not get the needed items to defeat the Beholder and you have been defeated')
        print('Thanks for playing the game. Hope you enjoyed it.')
        sys.exit(1)


# Shows that status of inventory and the location of the player
def status(room):

    print('You are currently in the ' + room +
          ' please enter a direction, get item if available(type get) or exit, your options are: '
          + get_moves(room))
    print('Current inventory: ' + str(inventory))
    if 'item' in rooms[room]:
        print('Items available are: ' + rooms[room].get('item'))
    else:
        print('No items available')
    print('-----------------------')


# Main function for the program
def main():
    current_room = 'Foyer'  # Starting room for the castle
    finished = 'False'
    possible_moves = []
    print('Welcome to Beholder Slayer, you have been tasked to get all the items in the castle '
          'and kill the Beholder in the Tower.\n')

    # Main game loop, which is infinite loop that is exited by exit command or has_won function
    while finished != 'True':
        # Check to see facing the villain
        if current_room == 'Tower':
            has_won()
        # variable that has possible moves to check for valid input
        possible_moves = get_moves(current_room)

        status(current_room)
        user_input = input('Enter your move or get command:').capitalize()

        # Checks user input and takes action
        if user_input in possible_moves:
            # Had to do an addition test otherwise entering only part of on these words would
            # cause an error on the search in the data structure
            if user_input == 'East' or user_input == 'North' or user_input == 'West' or user_input == 'South':
                current_room = move_room(current_room, user_input)
            else:
                print('Please enter a valid choice from the list')
        elif user_input == 'Exit':
            answer = input('Do wish to play again or exit the game(Enter Yes or No)').capitalize()

            if answer == 'No':
                print('The game will now exit')
                sys.exit(1)
            else:
                # Reset the game to the beginning
                current_room = 'Foyer'
                inventory.clear()

        elif user_input == 'Get':
            get_item(current_room)

        else:
            print('Please enter a valid choice from the list')
    # Exit the program
    sys.exit(1)


if __name__ == "__main__":
    main()
