package controller;
import service.RoomService;
public class GuestSelectActionController {
	final RoomService roomService;
	public GuestSelectActionController(RoomService roomService) {
		this.roomService = roomService;
	}
}
