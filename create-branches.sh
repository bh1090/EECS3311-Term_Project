#!/bin/bash

# Script to create development branches for EECS3311-Term_Project
# This script creates all required branches from the main branch

set -e

echo "Creating development branches..."

# Array of branch names to create
branches=(
    "develop"
    "authentication"
    "core-room-booking"
    "admin-room-management"
    "service-requests"
    "booking-flow"
)

# Get the current branch to return to it later
current_branch=$(git branch --show-current)

# Create and push each branch
for branch in "${branches[@]}"; do
    echo "Creating branch: $branch"
    
    # Check if branch already exists locally
    if git show-ref --verify --quiet refs/heads/$branch; then
        echo "  Branch $branch already exists locally"
    else
        git branch $branch
        echo "  Created branch $branch locally"
    fi
    
    # Push the branch to remote
    if git ls-remote --heads origin $branch | grep -q $branch; then
        echo "  Branch $branch already exists on remote"
    else
        git push origin $branch
        echo "  Pushed branch $branch to remote"
    fi
done

# Return to the original branch
git checkout $current_branch

echo ""
echo "All branches created successfully!"
echo "Created branches:"
for branch in "${branches[@]}"; do
    echo "  - $branch"
done
