const Laptop = require("./Laptop");
const Tablet = require("./Tablet");
const gadget = { Laptop, Tablet };
module.exports = {
    createGadget(type, attributes) {
        const GadgetType = gadget[type];
        return new GadgetType(attributes);
    }
};