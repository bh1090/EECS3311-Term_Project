# EECS3311-Term_Project

## Branch Structure

This project uses multiple development branches for organizing work. See [BRANCHES.md](BRANCHES.md) for detailed information about each branch.

### Creating Development Branches

To create the required development branches, you have three options:

#### Option 1: GitHub Actions (Recommended)
1. Go to the "Actions" tab in the GitHub repository
2. Select the "Create Development Branches" workflow
3. Click "Run workflow"
4. All branches will be created automatically

#### Option 2: Run the Script
If you have local access and push permissions:
```bash
./create-branches.sh
```

#### Option 3: Manual Creation
See [BRANCHES.md](BRANCHES.md) for manual git commands to create each branch.

## Required Branches

- `develop` - Main development integration branch
- `authentication` - User authentication features
- `core-room-booking` - Core booking functionality
- `admin-room-management` - Administrative room management
- `service-requests` - Service request features
- `booking-flow` - Complete booking workflow