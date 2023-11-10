#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// Define a structure for the stack
struct Stack {
    char *items;
    int top;
    int capacity;
};

// Function to initialize the stack
void initialize(struct Stack *stack, int capacity) {
    stack->capacity = capacity;
    stack->top = -1;
    stack->items = (char *)malloc(sizeof(char) * capacity);
    if (stack->items == NULL) {
        perror("Memory allocation failed");
        exit(1);
    }
}

// Function to check if the stack is empty
bool isEmpty(struct Stack *stack) {
    return stack->top == -1;
}

// Function to check if the stack is full
bool isFull(struct Stack *stack) {
    return stack->top == stack->capacity - 1;
}

// Function to push a character onto the stack
void push(struct Stack *stack, char item) {
    if (isFull(stack)) {
        printf("Stack is full. Cannot push %c.\n", item);
    } else {
        stack->items[++stack->top] = item;
    }
}

// Function to pop a character from the stack
char pop(struct Stack *stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty. Cannot pop.\n");
        return '\0';
    } else {
        return stack->items[stack->top--];
    }
}

// Function to check the validity of braces in an expression
bool checkBracesValidity(const char *expression) {
    struct Stack stack;
    int i;
    initialize(&stack, strlen(expression));

    for (i = 0; expression[i] != '\0'; i++) {
        char currentChar = expression[i];
        if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
            push(&stack, currentChar);
        } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
            if (isEmpty(&stack)) {
                return false; // Stack is empty, so there's no matching opening brace.
            }
            char popped = pop(&stack);
            if ((currentChar == ')' && popped != '(') ||
                (currentChar == '}' && popped != '{') ||
                (currentChar == ']' && popped != '[')) {
                return false; // Mismatched closing and opening braces.
            }
        }
    }

    // If the stack is empty at the end, all braces are valid.
    return isEmpty(&stack);
}

int main() {
    const char *expression1 = "((a + b) - (c * d))"; // Valid expression
    const char *expression2 = "({[a + b]})";        // Valid expression
    const char *expression3 = "{[a + b})";          // Invalid expression

    if (checkBracesValidity(expression1)) {
        printf("Expression 1 is valid.\n");
    } else {
        printf("Expression 1 is invalid.\n");
    }

    if (checkBracesValidity(expression2)) {
        printf("Expression 2 is valid.\n");
    } else {
        printf("Expression 2 is invalid.\n");
    }

    if (checkBracesValidity(expression3)) {
        printf("Expression 3 is valid.\n");
    } else {
        printf("Expression 3 is invalid.\n");
    }

    return 0;
}

