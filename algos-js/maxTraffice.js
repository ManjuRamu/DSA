/**
 * There is client-server architecture with n clients and one server.
 *  Each client starts its interaction with the server at the second start[i] 
 * and stops at the second end[i]. 
 * The maximum traffic is defined as the maximum number of concurrent interactions with the server.

Find the earliest time at which the maximum number of clients are interacting with the server.


 * 
 */

function findEarliestMaxTrafficTime(start, end) {
    // Create events for start and end times
    const events = [];
    for (let i = 0; i < start.length; i++) {
        events.push({ time: start[i], type: +1 }); // Start of interaction
        events.push({ time: end[i], type: -1 });  // End of interaction
    }

    // Sort events by time, then by type (-1 before +1 for same time)
    events.sort((a, b) => a.time - b.time || b.type - a.type);

    let maxClients = 0;
    let currentClients = 0;
    let earliestTime = -1;

    // Process events
    for (const event of events) {
        currentClients += event.type;

        if (currentClients > maxClients) {
            maxClients = currentClients;
            earliestTime = event.time;
        }
    }

    return earliestTime;
}

// Example usage:
const startTimes = [1, 2, 5,4];
const endTimes = [4, 6, 10,10];
const earliestTime = findEarliestMaxTrafficTime(startTimes, endTimes);

console.log("Earliest time of maximum traffic:", earliestTime);
