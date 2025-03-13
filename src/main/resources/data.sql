INSERT INTO customers (customerId, first_name, last_name, email, username, password, street_address, postal_code, city, province, phone_number, phone_type)
VALUES
    ('123e4567-e89b-12d3-a456-556642440000', 'John', 'Smith', 'john.smith@example.com', 'jsmith', 'password123', '123 Maple Street', 'M1M 1M1', 'Toronto', 'Ontario', '514-462-6922', 'MOBILE'),
    ('223e4567-e89b-12d3-a456-556642440001', 'Emily', 'Johnson', 'emily.johnson@example.com', 'ejohnson', 'password456', '456 Oak Avenue', 'V6B 2W1', 'Vancouver', 'British Columbia', '514-231-9568', 'MOBILE'),
    ('323e4567-e89b-12d3-a456-556642440002', 'Michael', 'Wong', 'michael.wong@example.com', 'mwong', 'password789', '789 Elm Street', 'H3H 2N2', 'Montreal', 'Quebec', '514-000-5555', 'WORK'),
    ('423e4567-e89b-12d3-a456-556642440003', 'Sara', 'Patel', 'sara.patel@example.com', 'spatel', 'password101', '321 Pine Street', 'T2N 4T4', 'Calgary', 'Alberta', '514-385-5512', 'MOBILE'),
    ('523e4567-e89b-12d3-a456-556642440004', 'David', 'Lee', 'david.lee@example.com', 'dlee', 'password202', '987 Cedar Avenue', 'K1K 7L7', 'Ottawa', 'Ontario', '514-645-1632', 'WORK'),
    ('623e4567-e89b-12d3-a456-556642440005', 'Alisha', 'Singh', 'alisha.singh@example.com', 'asingh', 'password303', '741 Birch Street', 'L5A 1X2', 'Mississauga', 'Ontario', '514-785-4444', 'WORK'),
    ('723e4567-e89b-12d3-a456-556642440006', 'Jason', 'Chen', 'jason.chen@example.com', 'jchen', 'password404', '852 Elmwood Drive', 'B3A 2K6', 'Halifax', 'Nova Scotia', '514-990-8658', 'HOME'),
    ('823e4567-e89b-12d3-a456-556642440007', 'Sophia', 'Garcia', 'sophia.garcia@example.com', 'sgarcia', 'password505', '963 Spruce Road', 'G1P 3T5', 'Quebec City', 'Quebec', '514-856-2541', 'MOBILE'),
    ('923e4567-e89b-12d3-a456-556642440008', 'Daniel', 'Martinez', 'daniel.martinez@example.com', 'dmartinez', 'password606', '654 Oak Lane', 'E1A 4R7', 'Fredericton', 'New Brunswick', '514-313-5123', 'MOBILE'),
    ('a23e4567-e89b-12d3-a456-556642440009', 'Jessica', 'Kim', 'jessica.kim@example.com', 'jkim', 'password707', '852 Pinecrest Boulevard', 'A1A 5W3', 'St. Johns', 'Newfoundland and Labrador', '514-512-6452', 'HOME');

INSERT INTO vehicles (vehicleid, inventoryid, status, "usage", "year", make, model, "value", currency)
VALUES
    ('fbf2d806-0350-4750-bd8f-481855a8e5eb', '758d74ae-7b39-4ea6-9bd9-3a2b78a32b0f', 'AVAILABLE', 'USED', 1998, 'Mercedes-Benz', 'M-Class', 70952.58, 'CAD'),
    ('ef0c7440-5bd8-4d97-b7bd-32075305835d', '1d18e981-b499-4cf2-8d38-3b7f00d43da2', 'AVAILABLE', 'NEW', 2006, 'Ferrari', '612 Scaglietti', 56732.96, 'USD'),
    ('3d148f9a-56aa-4f15-ba85-40141467c9ef', '6d8b8bce-e116-4879-ac97-c9dc2a06fb30', 'AVAILABLE', 'NEW', 2005, 'Land Rover', 'LR3', 12159.80, 'SAR'),
    ('0f769113-2a8d-48a3-8ceb-f74a05131177', '9e6a2e9a-f9f5-41d4-985d-d029d0a593db', 'SALE_PENDING', 'NEW', 1994, 'Mazda', '323', 12910.65, 'EUR'),
    ('43a3c2d4-113a-4204-94d8-b9da629bc423', 'e8e624b4-8150-4b5b-819b-7c8e8285b1fe', 'AVAILABLE', 'USED', 2000, 'Nissan', 'Frontier', 70356.99, 'CAD'),
    ('873d4f6a-0c8c-491b-bbe6-cf86ee6a4167', '528b2223-5ab1-4f9f-98ad-acbfa5e3e100', 'SALE_PENDING', 'USED', 2009, 'Jeep', 'Wrangler', 40224.41, 'CAD'),
    ('3ad05cfd-faf6-41a4-96e5-11e68e7296a8', '74373cf6-b08f-46dc-bed3-be9056c387fe', 'SALE_PENDING', 'USED', 1993, 'Oldsmobile', 'Achieva', 3671.23, 'CAD'),
    ('545c33ca-a3e9-4c45-ba3d-6926adeeab7c', '85cd329f-085e-431d-8bf9-a32abfb75b96', 'AVAILABLE', 'NEW', 1990, 'Mercedes-Benz', 'S-Class', 58696.79, 'SAR'),
    ('12cc658b-abd9-4d1a-b1cd-5992a6cab98b', 'bc5ce8c3-f73c-4478-b2e7-ff434a2049a8', 'SALE_PENDING', 'NEW', 1997, 'Mitsubishi', 'Montero Sport', 6958.38, 'SAR'),
    ('62afc013-7cee-4c34-b952-d59acca42998', '5b5e98cc-00dd-4ce9-855a-faf0991eaee0', 'SALE_PENDING', 'NEW', 1992, 'Ford', 'Aerostar', 98728.88, 'USD'),
    ('d909aa45-6efc-4cfa-9155-6f2249ad5ac3', '61ada735-9ca0-47b6-a1c6-9f6da22fc12d', 'AVAILABLE', 'USED', 2008, 'Suzuki', 'XL7', 44327.91, 'USD'),
    ('70b3eb87-f8eb-43f8-b34a-aa1b8c2d4069', '92b0f026-a4e3-4609-ac5f-a6ce57c79051', 'SALE_PENDING', 'USED', 2013, 'Hyundai', 'Accent', 53446.09, 'USD'),
    ('d3a4944d-8c93-4d66-a501-38ba0758985a', '9c4658f5-1e1b-4a11-8ed2-ec775484881b', 'SALE_PENDING', 'NEW', 2001, 'Acura', 'RL', 98239.40, 'CAD'),
    ('b22bd291-1946-4d15-948c-61338c581b50', '947f91a0-b2e8-4101-bfe0-b24b51ab5e40', 'AVAILABLE', 'NEW', 1998, 'Ford', 'Crown Victoria', 73507.08, 'USD'),
    ('e5630e92-c551-48e2-bae5-32afad3240f4', 'd7ef9149-9615-49a9-af19-84d9958f78d1', 'SOLD', 'NEW', 2000, 'Dodge', 'Ram Van 3500', 5805.18, 'SAR'),
    ('d552484b-5cfe-40b0-ae73-9e2fd4f523c2', '7577dbec-0c56-4c3d-995b-e27ef0cbed55', 'SALE_PENDING', 'USED', 2002, 'GMC', 'Savana 1500', 12986.39, 'USD'),
    ('dc1ce622-ce51-449c-a3ff-dfb8cebcede1', '5b6c4053-3b7e-43cb-86be-6687d144f09f', 'SOLD', 'NEW', 1996, 'GMC', 'Sonoma', 96121.14, 'SAR'),
    ('ff7a15c9-a1bd-4a4f-9803-f464c11cb15a', '351e5eb0-5c80-445a-a473-09691cf2b884', 'SOLD', 'NEW', 2000, 'GMC', 'Jimmy', 29774.36, 'CAD'),
    ('01e8f770-2d36-4e5b-81ba-b2a73c765625', '414c3206-ba4c-4c6d-a323-4a42d7e4493c', 'AVAILABLE', 'NEW', 1986, 'Mazda', 'B-Series', 7948.82, 'SAR');