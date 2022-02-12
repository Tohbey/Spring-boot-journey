package com.example.recipe.commands;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;
}
