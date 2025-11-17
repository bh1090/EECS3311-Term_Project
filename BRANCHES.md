# Development Branches

This document describes the development branches created for the EECS3311 Term Project.

## Branch Structure

The following branches have been created for organizing development work:

### 1. `develop`
Main development branch where features are integrated before merging to main/master.

### 2. `authentication`
Branch for implementing user authentication features including:
- User login/logout
- User registration
- Session management
- Password management

### 3. `core-room-booking`
Branch for core room booking functionality including:
- Room search and availability
- Booking creation
- Booking management
- Calendar integration

### 4. `admin-room-management`
Branch for administrative room management features including:
- Room creation and editing
- Room deletion
- Room configuration
- Room availability settings

### 5. `service-requests`
Branch for service request functionality including:
- Creating service requests
- Tracking service requests
- Service request fulfillment
- Request notifications

### 6. `booking-flow`
Branch for the complete booking workflow including:
- End-to-end booking process
- User experience flow
- Booking confirmation
- Booking modifications

## Creating Branches

To create these branches in your local repository and push them to GitHub, run:

```bash
./create-branches.sh
```

Or create them manually:

```bash
# Create and push develop branch
git branch develop
git push origin develop

# Create and push authentication branch
git branch authentication
git push origin authentication

# Create and push core-room-booking branch
git branch core-room-booking
git push origin core-room-booking

# Create and push admin-room-management branch
git branch admin-room-management
git push origin admin-room-management

# Create and push service-requests branch
git branch service-requests
git push origin service-requests

# Create and push booking-flow branch
git branch booking-flow
git push origin booking-flow
```

## Workflow

1. Feature development should happen on the respective feature branches
2. Features should be merged into `develop` for integration testing
3. After thorough testing, `develop` can be merged into `main`/`master` for production release
