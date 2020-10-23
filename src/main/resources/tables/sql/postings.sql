CREATE TABLE postings(
	p_id SERIAL PRIMARY KEY,
	mat_doc BIGINT,
	item INTEGER,
	doc_date VARCHAR,
	pstng_date VARCHAR,
	material_description VARCHAR,
	quantity INTEGER,
	bun VARCHAR,
	amount_lc NUMERIC,
	crcy VARCHAR,
	user_name VARCHAR,
	authorized_shipping BOOLEAN
)