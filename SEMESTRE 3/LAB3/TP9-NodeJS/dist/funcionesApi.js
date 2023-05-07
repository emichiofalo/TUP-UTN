"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.getEmpleadosGeneric = void 0;
function getData(url) {
    return __awaiter(this, void 0, void 0, function* () {
        let response = yield fetch(url, {
            method: 'GET',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': '*'
            },
            mode: 'cors'
        });
        console.log(response);
        if (!response.ok) {
            throw Error(response.statusText);
        }
        return response.json();
    });
}
function postPutData(url, method, data) {
    return __awaiter(this, void 0, void 0, function* () {
        const response = yield fetch(url, {
            method: method.toUpperCase(),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });
        if (!response.ok) {
            throw Error(response.statusText);
        }
        return response.json();
    });
}
function getEmpleadosGeneric(url) {
    return __awaiter(this, void 0, void 0, function* () {
        const empleados = yield getData(url);
        +console.log(empleados);
        return empleados;
    });
}
exports.getEmpleadosGeneric = getEmpleadosGeneric;
